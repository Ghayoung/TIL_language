#include<stdio.h>

int main(void)
{
	int num1,num2,num3;
	int result;

	printf("첫 번째 정수를 입력하세요:");
	scanf("%d", &num1);
	printf("두 번째 정수를 입력하세요:");
	scanf("%d", &num2);
	printf("세 번째 정수를 입력하세요:");
	scanf("%d", &num3);

	result=(num1-num2)*(num2+num3)*(num3%num1);

	printf("연산 결과: %d \n", result);
	return 0;
}
