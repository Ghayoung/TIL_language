#include<stdio.h>

int main(void)
{
	int num1,num2;

	printf("첫 번째 정수를 입력하세요: ");
	scanf("%d", &num1);
	printf("두 번째 정수를 입력하세요: ");
	scanf("%d", &num2);

	printf("두 수의 뺄셈의 결과는 %d입니다. \n", num1-num2);
	printf("두 수의 곱셈의 결과는 %d입니다. \n", num1*num2);
	return 0;
}