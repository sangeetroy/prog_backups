	//nwcm.cpp : Write a program to implement NWCM method
	using namespace std;
	#include<iostream>
	class NWCM
	{
	public:
  float nwcm(float cost[10][10],int c,int r,float cap[10],float req[10]);
	};
float NWCM :: nwcm(float cost[10][10],int c,int r, float cap[10],float req[10])
	{
	int i,j,k,flag,itr;
	float s1,s2;
	float allot[10][10];
	//To check whether the problem is balanced or unbalanced
	s1=s2=0;
		for(i=1;i<=c;i++)
		s1=s1+cap[i];
		for(i=1;i<=r;i++)
		s2=s2+req[i];
		if(s1<s2)
		{
		c=c+1;
			for(i=1;i<=r;i++)
			cost[c][r]=0;
		}
		else if(s2<s1)
		{
		r=r+1;
			for(i=1;i<=c;i++)
			cost[i][r]=0;
		}
	//To initialize allotment matrix with '0'
		for(i=1;i<=c;i++)
			for(j=1;j<=r;j++)
			allot[i][j]=0;
	//To calculate allotment using NWCM algorithm

	flag=1;
	i=1;
	j=1;
	itr=0;
		while(flag==1)
		{
		itr=itr+1;
			if(cap[i]<req[j])
			{
			allot[i][j]=cap[i];
			req[j]=req[j]-cap[i];
			cap[i]=0;
			i=i+1;
			}
			else
			{
			allot[i][j]=req[j];
			cap[i]=cap[i]-req[j];
			req[j]=0;
			j=j+1;
			}
		int i1,j1;
		char ch;
	    cout<<"Allotment Matrix after iteration-"<<itr<<"--->\n";
			for(i1=1;i1<=c;i1++)
			{
				for(j1=1;j1<=r;j1++)
				cout<<allot[i1][j1]<<"\t";
				cout<<cap[i1];
			cout<<endl;
			}
			for(j1=1;j1<=r;j1++)
			cout<<req[j1]<<"\t";
			cout<<endl;
	cout<<"\ntype any character and then press enter key-->";
		cin>>ch;
		
		flag=0;
	//Testing whether further iteration is required or not
			for(i=1;i<=c;i++)
				if(cap[i] !=0)
				{
				flag=1;
				break;
				}
			if(flag==0)
			{
				for(i=1;i<=r;i++)
				if(req[i] !=0)
				{
				flag=1;
				break;
				}
			}
		}
	cout<<endl<<"Elements in allotment matrix--->\n";
		for(i=1;i<=c;i++)
		{
			for(j=1;j<=r;j++)
			cout<<allot[i][j]<<"\t";
		cout<<endl;
		}
	cout<<endl<<"Elements in cost matrix--->\n";
		for(i=1;i<=c;i++)
		{
			for(j=1;j<=r;j++)
			cout<<cost[i][j]<<"\t";
		cout<<endl;
		}
	//To calculate total transportation cost
	s1=0;
		for(i=1;i<=c;i++)
			for(j=1;j<=r;j++)
			s1=s1+allot[i][j]*cost[i][j];
	return s1;
	}
	int main()
	{
	float cost[10][10],cap[10],req[10],s;
	int i,j,c,r,ch;
	system("clear");
	cout<<endl<<"Enter number of capacities(1-9)=";
	cin>>c;
	cout<<"Enter number of requirements(1-9)=";
	cin>>r;
     cout<<endl<<"Enter elements of cost matrix, capacity, requirement-->\n";
		for(i=1;i<=c;i++)
			for(j=1;j<=r;j++)
			{
			cout<<"cost["<<i<<"]["<<j<<"]=";
			cin>>cost[i][j];
			}
		for(i=1;i<=c;i++)
		{
		cout<<"capacity["<<i<<"]=";
		cin>>cap[i];
		}
		for(i=1;i<=r;i++)
		{
		cout<<"requirement["<<i<<"]=";
		cin>>req[i];
		}
     NWCM N;
     s=N.nwcm(cost,c,r,cap,req);
     cout<<endl<<"Total Transportation cost using NWCM="<<s<<endl;
     cout<<"type any number and then press enter key--->";
     cin>>ch;
     return 0;
     }



