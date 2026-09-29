# test_FourBasicOpt.py
# TDD 1단계: 실제 코드(FourBasicOpt.py)를 작성하기 전에 테스트 코드를 먼저 작성
import unittest
from FourBasicOpt import FourBasicOpt


class FourBasicOptTest(unittest.TestCase):

    def test_add_01(self):
        four_opt = FourBasicOpt()
        self.assertEqual(four_opt.add(100, 10), 110)

    def test_add_02(self):
        four_opt = FourBasicOpt()
        self.assertEqual(four_opt.add(100, -10), 90)

    def test_subtract_01(self):
        four_opt = FourBasicOpt()
        self.assertEqual(four_opt.subtract(100, 10), 90)

    def test_subtract_02(self):
        four_opt = FourBasicOpt()
        self.assertEqual(four_opt.subtract(100, -10), 110)

    def test_divide_01(self):
        four_opt = FourBasicOpt()
        self.assertEqual(four_opt.divide(100, 10), 10)

    def test_divide_02(self):
        four_opt = FourBasicOpt()
        self.assertEqual(four_opt.divide(100, 0), 0)  # 0으로 나누면 0 반환

    def test_multiply_01(self):
        four_opt = FourBasicOpt()
        self.assertEqual(four_opt.multiply(100, 10), 1000)

    def test_multiply_02(self):
        four_opt = FourBasicOpt()
        self.assertEqual(four_opt.multiply(100, 1), 100)


if __name__ == '__main__':
    unittest.main()
