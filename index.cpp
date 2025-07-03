#include <iostream>
using namespace std;

int main() {
    int numbers[10];  // Static array of size 10

    // Populate array with user input
    cout << "Enter 10 integers:" << endl;
    for (int i = 0; i < 10; i++) {
        cout << "Element " << (i + 1) << ": ";
        cin >> numbers[i];
    }

    // Print all values
    cout << "You entered:" << endl;
    for (int i = 0; i < 10; i++) {
        cout << numbers[i] << " ";
    }

    cout << endl;
    return 0;
}