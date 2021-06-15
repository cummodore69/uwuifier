#include <algorithm>
#include <string>
#include <iostream>

using namespace std;

void replaceString()
{
    string stutter = "i";
    string s;
    cout << "pwease entew text uwu: " << endl;
    getline(cin, s);
    replace(s.begin(), s.end(), 'l', 'w');
    replace(s.begin(), s.end(), 'r', 'w');
    replace(s.begin(), s.end(), 'v', 'f');

    cout << s + " >~<" << endl;
}

int main()
{

    replaceString();
    return 0;
}
