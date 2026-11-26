var floodFill = function(image, sr, sc, color) {

    const m = image.length;
    const n = image[0].length;
    const originalColor = image[sr][sc];
    // 이미 목표 색이면 바꿀 게 없다. 이 가드가 있어야
    // "색이 바뀐 칸 = 방문한 칸"이 성립해 visited 없이 돈다.
    if (originalColor === color) return image;

    // i는 행, j는 열
    const dfs = (i, j) => {
        // 범위 검사를 함수 안 한 곳으로 모아 호출부의 조건 4개를 없앤다
        if (i < 0 || i >= m || j < 0 || j >= n) return;
        if (image[i][j] !== originalColor) return;
        // 재귀 전에 칠해야 이웃이 다시 이 칸으로 돌아오지 않는다
        image[i][j] = color;
        dfs(i - 1, j); // 위
        dfs(i + 1, j); // 아래
        dfs(i, j - 1); // 왼쪽
        dfs(i, j + 1); // 오른쪽
    };

    dfs(sr, sc);
    return image;
};

console.log(floodFill([[1, 1, 1], [1, 1, 0], [1, 0, 1]] , 1, 1, 2));
console.log(floodFill([[0, 0, 0], [0, 0, 0]] , 0, 0, 0));
console.log(floodFill([[0, 0, 0], [0, 0, 0]] , 1, 0, 2));
