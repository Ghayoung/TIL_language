void main() {
  checkVersion();
  print('end process');
}

//비동기 처리
Future checkVersion() async {
  var version = await lookUpVersion(); //처리가 완료될 때까지 다음 코드의 처리를 멈춘다
  print(version);
}

int lookUpVersion() {
  return 12;
}