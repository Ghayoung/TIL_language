#include<stdio.h>

int main(void)
{
	int num; //점수
	int i=0;
	int	sum=0; //점수들의 합
	double aver; //평균

	while(i<3)
	{
		printf("0부터 100사이의 점수를 입력하세요: ");
		scanf("%d", &num);

		if((num<0)||(num>100))
		{
			printf("0에서 100사이의 값이 아닙니다.\n");
			continue;
		}
		
		i++;
		sum+=num;
	}

	aver=(double)sum/i;

	printf("결과 : ");

	if((aver>=90)&&(aver<=100))
		printf("A\n");

	else if((aver>=80)&&(aver<=89))
		printf("B\n");
	
	else if((aver>=70)&&(aver<=79))
		printf("C\n");
	
	else if((aver>=60)&&(aver<=69))
		printf("D\n");
	
	else
		printf("F\n");

	return 0;
}