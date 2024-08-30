from typing import List
from heapq import heappop, heappush
from collections import defaultdict


class Solution:
    def maxProbability(
            self,
            n: int,
            edges: List[List[int]],
            success_probability: List[float],
            start: int,
            end: int,
    ) -> float:
        graph = defaultdict(list)

        for (node1, node2), success_prob in zip(edges, success_probability):
            graph[node1].append((node2, success_prob))
            graph[node2].append((node1, success_prob))

        queue = [(-1, start)]

        probabilities = [0] * n
        probabilities[start] = 1

        while queue:
            negative_w, current = heappop(queue)
            w = -negative_w

            if probabilities[current] > w:
                continue

            for neighbor, edge_prob in graph[current]:

                new_prob = probabilities[current] * edge_prob

                if probabilities[neighbor] < new_prob:
                    probabilities[neighbor] = new_prob
                    heappush(queue, (-new_prob, neighbor))

        return probabilities[end]


solution = Solution
edges = [[0, 1], [1, 2], [0, 2]]
succProb = [0.5, 0.5, 0.2]
print(solution.maxProbability(3, edges, succProb, 0, 2))

edges = [[0, 1], [1, 2], [0, 2]]
succProb = [0.5, 0.5, 0.3]
print(solution.maxProbability(3, edges, succProb, 0, 2))

edges = [[0, 1]]
succProb = [0.5]
print(solution.maxProbability(3, edges, succProb, 0, 2))
