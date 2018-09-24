#include<stdio.h>

int main(void)
{
	int arr[8] = {1,2,3,4,5,6,7,8}; //길이가 8인 int형 배열 선언 후 초기화
	int *ptr1 = &arr[0]; //배열의 첫 번째 요소를 가리키는 포인터 변수 ptr1 선언
	int *ptr2 = &arr[7]; //배열의 마지막 요소를 가리키는 포인터 변수 ptr2 선언
	int temp; //임시 저장
	int i;

	for(i=0; i<4; i++)
	{
		temp = *ptr1;
		*ptr1 = *ptr2;
		*ptr2 = temp;
		ptr1 += 1;
		ptr2 -= 1;
	}

	for(i=0; i<8; i++)
		printf("%d ", arr[i]);

	printf("\n");
	return 0;
}