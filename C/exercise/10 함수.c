#include<stdio.h>

double num1, num2; //전역 변수

double Add(void) //덧셈 함수
{
	printf("덧셈입니다.\n");
	printf("두 개의 수를 입력하세요: ");
	scanf("%lf %lf", &num1, &num2);
	return num1+num2;
}

double Sub(void) //뺄셈 함수
{
	printf("뺄셈입니다.\n");
	printf("두 개의 수를 입력하세요: ");
	scanf("%lf %lf", &num1, &num2);
	return num1-num2;
}

double Mul(void) //곱셈 함수
{
	printf("곱셈입니다.\n");
	printf("두 개의 수를 입력하세요: ");
	scanf("%lf %lf", &num1, &num2);
	return num1*num2;
}

double Div(void) //나눗셈 함수
{
	printf("나눗셈입니다.\n");
	printf("두 개의 수를 입력하세요: ");
	while(1)
	{
		scanf("%lf %lf", &num1, &num2);

		if(num2==0)
		{
			printf("두 번째 수에 0입력 불가\n");
			printf("다시 입력하세요: ");
		}
		else
			break;
	}
	return num1/num2;
}

double AbsoValue(void) //절댓값 함수
{
	printf("절댓값입니다.\n");
	printf("수를 입력하세요: ");
	scanf("%lf", &num1);
	if(num1<0)
		return num1*(-1);
	else
		return num1;
}

double Mul2(void) //제곱 함수
{
	printf("제곱입니다.\n");
	printf("수를 입력하세요: ");
	scanf("%lf", &num1);
	return num1*num1;
}

int main(void) //main 함수
{
	int select; //연산 선택
	double result; //결과

	printf("1을 입력하면 덧셈, 2는 뺄셈, 3은 곱셈,\n");
	printf("4는 나눗셈, 5는 절대값, 6은 제곱을 계산합니다.\n\n");
	printf("원하는 연산 번호를 입력하세요(1에서 6까지 입력) : ");

	while(1)
	{
		scanf("%d", &select);

		if((select<1)||(select>6))
			printf("다시 입력하세요 : ");
		else
			break;
	}

	switch(select)
	{
	case 1: //덧셈
		result=Add();
		printf("연산 결과 : %f \n", result);
		break;
	case 2: //뺄셈
		result=Sub();
		printf("연산 결과 : %f \n", result);
		break;
	case 3: //곱셈
		result=Mul();
		printf("연산 결과 : %f \n", result);
		break;
	case 4: //나눗셈
		result=Div();
		printf("연산 결과 : %f \n", result);
		break;
	case 5: //절댓값
		result=AbsoValue();
		printf("연산 결과 : %f \n", result);
		break;
	case 6: //제곱
		result=Mul2();
		printf("연산 결과 : %f \n", result);
		break;
	}
	return 0;
}