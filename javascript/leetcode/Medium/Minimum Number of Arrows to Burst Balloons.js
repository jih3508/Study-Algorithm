/**
 * @param {number[][]} points
 * @return {number}
 */
var findMinArrowShots = function(points) {
    const size = points.length;

    // 끝 지점으로 정렬
    points.sort(function(point1, point2) {
        return point1[1] - point2[1];
    })

    let count = 1;
    let arrow = points[0][1]; // 끝 지점으로 정렬

    for (let i = 0; i < size; i++) {
        if(arrow < points[i][0]){
            count++; // 개수 증가
            arrow = points[i][1]; // 다시 끝지점으로 위치 지정
        }
    }

    return count
};

let points = [[10, 16], [2, 8], [1, 6], [7, 12]]
console.log(findMinArrowShots(points))
points = [[1, 2], [3, 4], [5, 6], [7, 8]]
console.log(findMinArrowShots(points))
points = [[1, 2], [2, 3], [3, 4], [4, 5]]
console.log(findMinArrowShots(points))
points = [[60051528, 100384399], [12805732, 32854561], [78409503, 93939522], [13258270, 86621638], [9959708, 87446423],
    [73226340, 104744489], [747796, 90448519], [17142618, 85144863], [50122846, 89616297], [90892921, 151136476]]
console.log(findMinArrowShots(points))
points = [[3, 9], [7, 12], [3, 8], [6, 8], [9, 10], [2, 9], [0, 9], [3, 9], [0, 6], [2, 8]]
console.log(findMinArrowShots(points))