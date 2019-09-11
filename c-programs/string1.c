#include<stdio.h>
#include<string.h>
void main()
{
   char name[] = "shivam3456 78 0  is a 1boy56";
   int i,sum=0;
    for(i=0;name[i]!='\0';i++)
    {
       if(name[i] > 48 && name[i] < 58)
       {
           sum = sum + (int)(name[i]-48);
       }
       
    }
   
       printf("the sum of given number is %d",sum);
   }
