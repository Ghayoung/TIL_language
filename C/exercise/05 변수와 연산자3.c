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

	result=num1*num2+num3;

	printf("%d × %d + %d = %d \n", num1, num2, num3, result);
	return 0;
}