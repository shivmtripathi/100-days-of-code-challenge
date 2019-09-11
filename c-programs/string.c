#include<stdio.h>
#include<string.h>
void main()
{
   char name[] = "shivam is a boy";
   int i,n,c=0;
    n =strlen(name);
  for (i=n;i>=0;i--)
  { 
		if (name[i] == ' ') 
		{ 
		    c++;
			name[i] = '\0'; 
			printf("%s ",&(name[i])+1); 
		} 
	} 
	printf("%s",name); 
	printf("\n the number of spaces is %d",c);
}
