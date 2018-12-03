// 4-13.cpp : 콘솔 응용 프로그램에 대한 진입점을 정의합니다.
//

#include "stdafx.h"
#include<iostream>
#include<string>
using namespace std;


int main()
{
	string s;

	cout << "아래에 문자열을 입력하세요. 빈 칸이 있어도 됩니다.(한글 안됨)" << endl;
	getline(cin, s, '\n');
	int len = s.length();

	for (int i = 0; i < len; i++) {
		string first = s.substr(0, 1);
		string sub = s.substr(1, len - 1);
		s = sub + first;
		cout << s << endl;
	}
    return 0;
}

