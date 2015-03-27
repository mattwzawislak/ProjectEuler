#include "Problem.h"
#include <array>

#include "../page1/Euler001.cpp"
#include "../page1/Euler002.cpp"

#define SIZE 2

class Problems
{

private:

	Problem* problems[2];

public:

	Problems::Problems()
	{
		problems[0] = new Euler001();
		problems[1] = new Euler002();
	}
	
	Problem* getProblem(int number){
		if (number > SIZE || number <= 0)
		{
			throw "Number not in range.";
		}
		Problem* problem = problems[number - 1];
		if (problem == 0)
		{
			throw "Problem not solved yet.";
		}
		else {
			return problem;
		}
	}
};


