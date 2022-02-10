#ifndef _BOOK
#define _BOOK

#include "include.h"

class book {
	std::string title;
	std::vector<std::string> writer;
	std::string publish;
	std::string place;
	int rls;
public:
	void inputTitle();
	std::string getTitle();
	void inputWriter();
	std::string getWriter();
	void inputPublish();
	std::string getPublish();
	void inputPlace();
	std::string getPlace();
	void inputRls();
	int getRls();
	void getData();
	void inputData();
	std::string gen();
};

#endif
