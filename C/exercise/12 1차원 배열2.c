#include<stdio.h>

int main(void)
{
	double arr[10]={1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	double result[10]; //결과를 저장할 배열
	int n; //이동할 칸 수
	char dir; //이동할 방향
	double * ptr=arr;
	double * ptr2=result;
	int i; 
	char temp;

	printf("이동 전 배열 : ");

	for(i=0;i<10;i++)
		printf("%1.0f ", *(ptr+i));

	printf("\n");

	printf("몇 칸을 움직이시겠습니까? : ");
	scanf("%d",&n);
	scanf("%c",&temp); //enter 저장

	while(1)
	{
		printf("방향을 입력하세요.(L/R) : ");
		scanf("%c",&dir);
		scanf("%c",&temp); //enter 저장

		if((dir=='L')||(dir=='R'))
			break;
		else
			printf("잘못 입력하셨습니다. \n");
	}

	//result에 이동한 요소 저장

	if(dir=='R') //오른쪽으로 이동
	{
		for(i=0;i<10;i++)
		{
			if(i+n>9)
				*(ptr2+(i+n-10)) = *(ptr+i);
			else
				*(ptr2+(i+n)) = *(ptr+i);
		}
	}
	else //왼쪽으로 이동
	{
		for(i=0;i<10;i++)
		{
			if(i-n<0)
				*(ptr2+(i-n+10)) = *(ptr+i);
			else
				*(ptr2+(i-n)) = *(ptr+i);
		}
	}

	printf("%c쪽으로 %d칸 이동 후 배열 : ", dir, n);
	for(i=0;i<10;i++)
		printf("%1.0f ", *(ptr2+i));
	
	printf("\n");


 return 0;
}