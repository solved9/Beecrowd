#include <iostream>
using namespace std;

int main() {
	int N;

	// Read the integer N
	cin >> N;

	// Check if N is within the valid range
	if (N <= 1 && N >= 1000) {
		return 1;
	}

	// Print N * 2 lines of output
	for (int i = 1; i <= N; i=i+1) {
		for (int j = 1; j <= i; j=j+N) {

			cout << i << " "<< i * i << " "<< i * i * i << endl;

			cout << i << " "<< (i * i)+1 << " "<< (i * i * i)+1 << endl;
		}
	}

	return 0;
}
