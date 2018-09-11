#include<stdio.h>

int main(void)
{
	int num1;
	printf("정수를 입력하세요:");
	scanf("%d", &num1);

	printf("입력한 정수의 제곱은 %d입니다. \n", num1*num1);
	return 0;
}