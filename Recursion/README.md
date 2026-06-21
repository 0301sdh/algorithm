# Algorithm Study

알고리즘을 공부하며 작성한 예제 코드 저장소입니다.

## Progress

- [O] Recursion

---

## Recursion

### 구현 파일

**RecursionExample1.java** - 수학 관련 재귀
| 메서드 | 설명 | 시간복잡도 |
|---|---|---|
| `factorial(int n)` | 팩토리얼 (n!) | O(n) |
| `power(double x, int n)` | x의 n제곱 | O(n) |
| `fibonacci(int n)` | 피보나치 수열 | O(2^n) |
| `gcd(int m, int n)` | 최대공약수 (유클리드 호제법) | O(log n) |
| `gcd2(int p, int q)` | 최대공약수 (간결한 버전) | O(log n) |

**RecursionExample2.java** - 문자열/배열 재귀
| 메서드 | 설명 | 시간복잡도 |
|---|---|---|
| `length(String str)` | 문자열 길이 계산 | O(n) |
| `printChars(String str)` | 문자열 출력 | O(n) |
| `printCharsReverse(String str)` | 문자열 뒤집어 출력 | O(n) |
| `printInBinary(int n)` | 2진수 변환 출력 | O(log n) |
| `sum(int n, int[] data)` | 배열의 합 | O(n) |
| `readFrom(int n, int[] data, Scanner in)` | 데이터 읽어오기 | O(n) |

**RecursionExample3.java** - 탐색 재귀
| 메서드 | 설명 | 시간복잡도 |
|---|---|---|
| `search()` | 순차탐색 (앞에서부터) | O(n) |
| `search1()` | 순차탐색 (뒤에서부터) | O(n) |
| `search2()` | 순차탐색 (중간 분할) | O(n) |
| `findMax()` | 최대값 찾기 | O(n) |
| `findMax1()` | 최대값 찾기 (분할정복) | O(n) |
| `binarySearch()` | 이진검색 (정렬된 데이터) | O(log n) |


+**Maze.java** - 26/6/16 미로 탐색 (백트래킹) Recursion 으로 작성 

**CountCells.java** - 26/6/17 Blob 카운팅  Recursion 으로 작성
| 항목 | 설명 |
|---|---|
| 목적 | 2D 그리드에서 연결된 이미지 셀(blob)의 크기를 재귀로 계산 |
| 시간복잡도 | O(N²) — 최악의 경우 모든 셀을 한 번씩 방문 |
| 핵심 로직 | 현재 셀을 ALREADY_COUNTED(2)로 마킹 후 8방향 재귀 탐색 |
- 방문 체크를 안 하면 무한 재귀에 빠짐 → 값을 2로 바꿔서 재방문 방지

**NQueens.java** - 26/6/21 N-Queens (백트래킹)
| 항목 | 설명 |
|---|---|
| 목적 | N×N 체스판에 N개의 퀸을 서로 공격할 수 없도록 배치 |
| 시간복잡도 | O(n!) — 같은 열 제외(가지치기) 기준 |
| 핵심 로직 | 각 행에 퀸을 배치 후 promising()으로 유망성 검사, 실패 시 백트래킹 |
- promising(): 같은 열, 같은 대각선에 퀸이 있는지 검사
- 유망하지 않은 경우 가지치기(pruning)하여 탐색 공간 축소



## Goal

- 알고리즘 이해
- Git/GitHub 활용
