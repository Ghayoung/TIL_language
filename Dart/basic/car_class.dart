// 자동차 클래스
void main() {
  Car bmw = Car(320, 100000, 'BMW');

  bmw.saleCar();
  bmw.saleCar();
  bmw.saleCar();
  print(bmw.price);
}

class Car {
  int maxSpeed = 320;
  num price = 100000;
  String name = 'BMW';

  Car(int maxSpeed, num price, String name) {
    this.maxSpeed = maxSpeed;
    this.price = price;
    this.name = name;
  }

  num saleCar() {
    price = price * 0.9;
    return price;
  }
}