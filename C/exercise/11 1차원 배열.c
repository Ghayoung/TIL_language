#include<stdio.h>

int main(void)
{
	char str[100];
	int idx=0;
	int alp=0;
	int etc=0;

	printf("입력한 문장의 알파벳 갯수를 세어 주는 프로그램입니다.\n");
	printf("문장을 입력하세요(최대99자): ");

	scanf("%s", str);

	while(str[idx]!='\0')
	{
		if(65<=str[idx] && str[idx]<=90 || 97<=str[idx] && str[idx]<=122)
			alp++;
		else
			etc++;
		idx++;
	}
	printf("알파벳의 갯수 : %d \n", alp);
	printf("기타 문자의 갯수 : %d \n", etc);

	return 0;
}