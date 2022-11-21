void main() {
  printOne();
  printTwo();
  printThree();
}

void printOne() {
  print('One');
}

void printThree() {
  print('Three');
}

void printTwo() async {
  // await 키워드를 붙였으므로 이후 코드의 실행이 멈춘다.
  await Future.delayed(Duration(seconds: 1), () {
    print('Future!!');
  });
  print('Two');
}
