#include<stdio.h>

int main(void)
{
	int arr[7] = {1,2,3,4,5,6,7}; //길이가 7인 int형 배열 선언 후 초기화
	int *ptr = &arr[6]; //배열의 마지막 요소를 가리키는 포인터 변수 ptr 선언
	int total = 0; //합을 저장할 변수
	int i;

	for(i=0; i<7; i++)
		total += *(ptr--);

	printf("합 : %d \n", total);
	return 0;
}