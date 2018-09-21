#include<stdio.h>

int main(void)
{
	int arr[7] = {1,2,3,4,5,6,7}; //길이가 7인 int형 배열 선언 후 초기화
	int *ptr = arr; //배열의 첫 번째 요소를 가리키는 포인터 변수 ptr 선언
	int i;

	for(i=0; i<7; i++)
	{
		*ptr += 2; //모든 배열요소의 값 2씩 증가
		ptr++;
	}

	for(i=0; i<7; i++)
		printf("%d ", arr[i]); //증가가 이뤄졌는지 확인

	printf("\n");
	return 0;
}