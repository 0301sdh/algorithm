# 자바로 공부한 알고리즘 (Algorithm Study in Java)

자바로 알고리즘의 **원리와 시간복잡도**를 정리하며 학습한 저장소입니다.
각 알고리즘을 직접 구현하고, 폴더별 **README에 동작 원리·복잡도·핵심 포인트**를 기록했습니다.

> 자료구조 학습 저장소도 함께 보시면 좋습니다 → [Data_Structure_Java](https://github.com/0301sdh/Data_Structure_Java)

<br>

## 학습 원칙

- 알고리즘의 **동작 원리를 코드로** 확인하기
- 최선·최악 **시간복잡도**를 근거와 함께 이해하기
- "왜 이 방식이 더 빠른가 / 언제 써야 하는가"를 설명할 수 있기

<br>

## 학습 목록

> 각 항목을 클릭하면 상세 정리 문서로 이동합니다.

### 재귀 · 백트래킹 (Recursion) → [바로가기](./Recursion)

기초 재귀부터 백트래킹을 활용한 완전 탐색까지.

| 파일 | 내용 |
|------|------|
| `RecursionExample1~3` | 팩토리얼·거듭제곱·피보나치·유클리드 호제법, 순차/이진 탐색 등 |
| `Maze` | 미로 경로 탐색 (백트래킹) |
| `CountCells` | 2D 그리드 연결 영역(Blob) 크기 계산 |
| `NQueens` | N-Queens 문제 (가지치기 pruning) |
| `PowerSet` | 멱집합(부분집합) 생성 |

### 정렬 (Sort) → [바로가기](./Sort)

비교 정렬 6종 + 비비교(선형) 정렬 2종, 총 8종을 구현하고 비교했습니다.

| 정렬 | 최선 | 최악 | 특징 |
|------|:----:|:----:|------|
| Selection | O(n²) | O(n²) | 항상 전체 비교 |
| Bubble | O(n²) | O(n²) | 인접 교환 |
| Insertion | O(n) | O(n²) | 거의 정렬된 입력에 강함 |
| Merge | O(n log n) | O(n log n) | 안정 정렬, 임시 배열 필요 |
| Quick | O(n log n) | O(n²) | 제자리 정렬, 랜덤 피벗으로 최악 회피 |
| Heap | O(n log n) | O(n log n) | 제자리 + 최악 보장 (불안정) |
| Counting | O(n+k) | O(n+k) | 비교 없는 선형 정렬 (정수 범위) |
| Radix | O(d(n+k)) | O(d(n+k)) | 자리 단위 정렬 (안정 정렬 전제) |

### 트리 (Tree) → [바로가기](./Tree)

| 파일 | 내용 |
|------|------|
| `LevelOrderTraversal` | 레벨 순회 (BFS 기반) |
| `BSTSuccessor` | 이진탐색트리에서 후계자(successor) 찾기 |

<br>

## 기술 스택

- **Language**: Java
- **구성**: 알고리즘별 `구현 + 정리 문서(README)`

<br>

## 프로젝트 구조

```
algorithm/
├── Recursion/   # 재귀 · 백트래킹 (Maze, NQueens, PowerSet ...)
├── Sort/        # 정렬 8종 (Selection ~ Radix)
└── Tree/        # 트리 순회 · 탐색
```

각 폴더 안의 `README.md` 에 알고리즘의 원리·시간복잡도·핵심 포인트를 정리해두었습니다.
