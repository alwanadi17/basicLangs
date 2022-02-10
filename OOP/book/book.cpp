#include "book.h"
#include "include.h"

void removeSpaces(std::string &str)
{
	char *ptr;
	size_t pos;

	ptr = &str[0];

	//remove spaces at the beginning
	while (*ptr == ' ') ptr++;
	str.erase(0, ptr-&str[0]);

	//remove spaces at the end
	ptr = &str[0] + str.length()-1;
	while (*ptr == ' ') ptr--;
	str.erase(ptr+1-(&str[0]), &str[0]+str.length()-ptr-1);

	//remove double spaces in the middle
	while (true) {
		pos = str.find("  ");
		if (pos == std::string::npos) break;

		ptr = &str.at(pos);

		while (*ptr == ' ') ptr++;

		str.erase(pos, ptr-(&str[pos])-1);
        }
}

void book::inputTitle()
{
	std::cout << "input book title: ";
	std::getline(std::cin >> std::ws, this->title);
	removeSpaces(this->title);
}

std::string book::getTitle()
{
	return this->title;
}

void book::inputWriter()
{
	this->writer.clear();
	std::string tmp;
	while(tmp != "done") {
		std::cout << "input book writer(input \"done\" if done): ";
		std::getline(std::cin >> std::ws, tmp);
		removeSpaces(tmp);
		if (tmp != "done") this->writer.push_back(tmp);
	}
}

std::string book::getWriter()
{
	std::string ret;
	for (std::string s : this->writer)
		ret += s + ", ";
	ret.pop_back(); ret.pop_back();
	return ret;
}

void book::inputPublish()
{
	std::cout << "input book publisher: ";
	std::getline(std::cin >> std::ws, this->publish);
	removeSpaces(this->publish);
}

std::string book::getPublish()
{
	return this->publish;
}

void book::inputPlace()
{
	std::cout << "input where the book published: ";
	std::getline(std::cin >> std::ws, this->place);
	removeSpaces(this->place);
}

std::string book::getPlace()
{
	return this->place;
}

void book::inputRls()
{
	std::cout << "input year book published: ";
	std::cin >> rls;
}

int book::getRls()
{
	return this->rls;
}

void book::getData()
{
	std::cout << "Title:\t\t\t" << this->getTitle() << std::endl
		  << "Writer:\t\t\t" << this->getWriter() << std::endl
		  << "Publisher:\t\t" << this->getPublish() << std::endl
		  << "Place published:\t" << this->getPlace() << std::endl
		  << "Year released:\t" << this->getRls() << std::endl;
}

void book::inputData()
{
	this->inputTitle();
	this->inputWriter();
	this->inputPublish();
	this->inputPlace();
	this->inputRls();
}

std::string book::gen()
{
	size_t pos = this->writer[0].rfind(' ');
	int size = this->writer.size();
	std::string tmp;

	switch(size){
		case 2:
			tmp += this->writer[0] + " dan " + this->writer[1] + ". " + std::to_string(this->rls) + ". " + this->title + ". " + this->place + ": " + this->publish;
			break;

		default:
			if (pos == std::string::npos)
				tmp += this->writer[0] + ". " + std::to_string(this->rls) + ". " + this->title + ". " + this->place + ": " + this->publish;
			else {
				tmp += this->writer[0].substr(pos+1,this->writer[0].length()-pos) + ", " + this->writer[0].substr(0,pos)
					+ ". " + std::to_string(this->rls) + ". " + this->title + ". " + this->place + ": " + this->publish;
			}

			if (size >= 3) tmp.insert((this->writer[0].find('.'))-1," et. all");
			break;

	}

	return tmp;
}
