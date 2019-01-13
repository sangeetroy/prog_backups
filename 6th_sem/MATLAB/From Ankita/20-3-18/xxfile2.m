%xxfile1.m:Write a program any file to binary file
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
file3=input('\nEnter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'r');
while ~feof(fp1)
    ch=fscanf(fp1,'%c',1);
    ch1=cast(ch,'uint8');%to convert char to integer
    if mod(ch1,2)=1
        ch2=char(ch1,1,0);
    else
        ch2=char(ch1,1,1);
    end
    fprintf('\n%c:',ch);
    %To convert number to bits
    for i=8:-1:1
        b=bitget(ch1,i);
        fprintf('%d',b);
    end
    fprintf(':%d',ch2);
    fprintf(fp2,'%c',ch2);
end
fclose('all');
%End of program