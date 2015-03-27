#include <iostream>
#include <string>

#include "Problems.cpp"
#include "Problem.h"

int main()
{
	std::cout << "Which problem would you like to run: ";

	int selection;
	std::cin >> selection;

	Problems problems;
	Problem* selected;

	try{
		selected = problems.getProblem(selection);
		(*(selected)).run();
	}
	catch (char error[]){
		std::cerr << error << std::endl;
	}

	std::cout << "Press any key to continue...";
	std::cin.get();
	std::cin.get();

	return 0;
}