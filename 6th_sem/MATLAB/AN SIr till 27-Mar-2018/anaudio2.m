%anaudio2.m: Write a program to reverse the content of any audio file
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File Name=','s');
file2=input('Enter Output Audio File name=','s');
[x,fs,nbits]=wavread(file1);
[y,n]=size(x);
fprintf('y=%d n=%d fs=%d nbits=%d\n',y,n,fs,nbits);
z(1:y)=x(y:-1:1);
sound(z,fs);
wavwrite(z,fs,file2);