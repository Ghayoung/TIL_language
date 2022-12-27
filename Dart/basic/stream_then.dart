main() {
  var stream = Stream.fromIterable([1, 2, 3, 4, 5]);
  // 가장 앞의 데이터 결과: 1
  stream.first.then((value) => print('first: $value'));

  stream = Stream.fromIterable([1, 2, 3, 4, 5]);
  // 가장 마지막 데이터의 결과: 5
  stream.last.then((value) => print('last: $value'));

  stream = Stream.fromIterable([1, 2, 3, 4, 5]);
  // 현재 스트림이 비어 있는지 확인: false
  stream.isEmpty.then((value) => print('isEmpty: $value'));

  stream = Stream.fromIterable([1, 2, 3, 4, 5]);
  // 전체 길이: 5
  stream.length.then((value) => print('length: $value'));
}