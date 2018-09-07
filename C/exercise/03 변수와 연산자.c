#include<stdio.h>

int main(void)
{
	int num1,num2;

	printf("첫 번째 정수를 입력하세요: ");
	scanf("%d", &num1);
	printf("두 번째 정수를 입력하세요: ");
	scanf("%d", &num2);

	printf("입력한 두 개의 정수는 %d, %d입니다. \n", num1, num2);
	printf("두 정수의 합은 %d \n", num1+num2);
	printf("두 정수의 곱은 %d \n", num1*num2);
	printf("두 정수의 차는 %d \n", num1-num2);
	printf("%d을 %d으로 나누었을 때의 몫은 %d \n", num1, num2, num1/num2);
	printf("%d을 %d으로 나누었을 때의 나머지는 %d \n", num1, num2, num1%num2);

	printf("%d 다음의 정수는 ", num1);
	num1++;
	printf("%d입니다. \n", num1);
	num1--;
	printf("%d 이전의 정수는 ", num1);
	num1--;
	printf("%d입니다. \n", num1);
	return 0;
}