"""
문제: 방문 길이
url: https://school.programmers.co.kr/learn/courses/30/lessons/49994
"""

from typing import Dict, Tuple

# 각 명령어에 대응하는 (dx, dy) 이동 벡터
MOVE: Dict[str, Tuple[int, int]] = {
    "U": (0, 1),
    "D": (0, -1),
    "R": (1, 0),
    "L": (-1, 0),
}

# 좌표평면 경계값
BOUNDARY_MIN, BOUNDARY_MAX = -5, 5


def solution(dirs: str) -> int:
    """
    명령어 문자열(dirs)을 받아 캐릭터가 처음 걸어본 길의 길이를 반환한다.

    Args:
        dirs: "U", "D", "L", "R"로 이루어진 명령어 문자열 (예: "ULURRDLLU")

    Returns:
        캐릭터가 실제로 처음 걸어본 길(간선)의 개수
    """
    location = (0, 0)  # 캐릭터의 현재 위치
    visited_edges = set()  # 지나간 구간(간선)을 저장하는 집합

    for direction in dirs:
        dx, dy = MOVE[direction]
        next_location = (location[0] + dx, location[1] + dy)

        # 경계를 벗어나는 이동은 무시
        if not _is_within_boundary(next_location):
            continue

        # 현재 위치 -> 다음 위치 구간을 기록
        # (A, B)와 (B, A)를 모두 넣어 방향에 상관없이 같은 길로 취급
        visited_edges.add((location, next_location))
        visited_edges.add((next_location, location))

        # 위치 갱신
        location = next_location

    # (A,B), (B,A) 두 개씩 저장했으므로 실제 간선 개수는 절반
    return len(visited_edges) // 2


def _is_within_boundary(point: Tuple[int, int]) -> bool:
    """좌표가 좌표평면 경계(-5 ~ 5) 안에 있는지 확인한다."""
    x, y = point
    return BOUNDARY_MIN <= x <= BOUNDARY_MAX and BOUNDARY_MIN <= y <= BOUNDARY_MAX