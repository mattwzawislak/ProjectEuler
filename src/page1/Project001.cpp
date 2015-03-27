#include <iostream>
#include <string>

int main()
{
	int sum = 0;
	int i = 3;

	while (i < 1000)
	{
		if (!(i % 3))
		{
			sum = sum + i;
		}
		else if (!(i % 5))
		{
			sum = sum + i;
		}
		++i;
	}
	std::cout << "Sum " << sum << std::endl;

	char c;
	std::cin >> c;
	return 0;
}
