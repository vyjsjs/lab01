# 실습 1 - TDD 사칙연산 (The Four Basic Arithmetic Operations)

실제 코드보다 **테스트 코드를 먼저** 작성하고(Red), 테스트를 통과하도록 구현(Green)했습니다.

| 파일 | 설명 |
|---|---|
| `test_FourBasicOpt.py` | 테스트 코드 (add / subtract / divide / multiply 각 2개, 총 8개) |
| `FourBasicOpt.py` | 실제 코드 (사칙연산 클래스) |
| `result_console_final.png` | **최종 콘솔 캡처** - 8개 테스트 모두 통과 |
| `result_console_tdd_process.png` | TDD 전체 과정 (Red → Green) 콘솔 캡처 |
| `step1_red_no_impl.txt` ~ `step3_green_final.txt` | 각 단계의 실제 콘솔 출력 원문 |

## TDD 진행 과정

1. **Red** - 테스트만 작성하고 실행 → `ModuleNotFoundError: No module named 'FourBasicOpt'`
2. **Red** - 강의 자료의 구현(`divide = x / y`)으로 실행 → `test_divide_02` 에서
   `ZeroDivisionError` 발생 (`divide(100, 0)` 은 0 을 기대)
3. **Green** - `divide` 에 0 으로 나누는 경우 0 을 반환하도록 수정 → **8개 테스트 모두 OK**

테스트가 먼저 있었기 때문에 0 으로 나누기 같은 예외 상황을 구현 단계에서 바로 발견할 수 있었습니다.

## 실행

```bash
python -m unittest -v test_FourBasicOpt
# 또는
python test_FourBasicOpt.py
```
