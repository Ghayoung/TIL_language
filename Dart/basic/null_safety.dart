/*자료형 다음에 ?를 붙이면 Null이 가능하다.
  식 다음에 !를 붙이면 Null이 아님을 직접 표시한다.*/

int? couldReturnNullButDoesnt() => -3; // null을 넣을 수 있음

void main() {
  int? couldBeNullButIsnt = 1; // null로 변경 가능
  List<int?> listThatCouldHoldNulls = [2, null, 4]; // List의 int에 null값 포함 가능
  List<int>? nullsList; // List 자체가 null일 수 있음
  int a = couldBeNullButIsnt; // null을 넣으면 오류
  //int b = listThatCouldHoldNulls.first; // int b는 ?가 없으므로 오류
  int b = listThatCouldHoldNulls.first!; // null이 아님을 직접 표시
  //int c = couldReturnNullButDoesnt().abs(); // null일 수도 있으므로 abs()에서 오류
  int c = couldReturnNullButDoesnt()!.abs(); // null이 아님을 직접 표시

  print('a is $a.');
  print('b is $b.');
  print('c is $c.');
}