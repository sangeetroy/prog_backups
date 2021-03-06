  clc;
clear all;
close all;

img1=input('Enter image file','s');
x=imread(img1);
[r,c,d]=size(x);

a1(1:floor(r/2),1:floor(c/2),:)=x(1:floor(r/2),1:floor(c/2),:);
a2(1:floor(r/2),1:floor(c/2),:)=x(floor(r/2)+1:r,1:floor(c/2),:);
a3(1:floor(r/2),1:floor(c/2),:)=x(1:floor(r/2),floor(c/2)+1:c,:);
a4(1:floor(r/2),1:floor(c/2),:)=x(floor(r/2)+1:r,floor(c/2)+1:c,:);
%imwrite(a1,'1.jpg');
%imwrite(a2,'2.jpg');
%imwrite(a3,'3.jpg');
%imwrite(a4,'4.jpg');

[r,c,d]=size(a2);

ca2(1:r,1:c,1)=0.2989*a2(1:r,1:c,1)+0.587*a2(1:r,1:c,2)+0.1140*a2(1:r,1:c,3);
ca2(1:r,1:c,2)=0.2989*a2(1:r,1:c,1)+0.587*a2(1:r,1:c,2)+0.1140*a2(1:r,1:c,3);
ca2(1:r,1:c,3)=0.2989*a2(1:r,1:c,1)+0.587*a2(1:r,1:c,2)+0.1140*a2(1:r,1:c,3);

%imshow(ca2);
[r,c,d]=size(a3);
ca3(1:r,1:c,1)=0.2989*a3(1:r,1:c,1)+0.587*a3(1:r,1:c,2)+0.1140*a3(1:r,1:c,3);
ca3(1:r,1:c,2)=0.2989*a3(1:r,1:c,1)+0.587*a3(1:r,1:c,2)+0.1140*a3(1:r,1:c,3);
ca3(1:r,1:c,3)=0.2989*a3(1:r,1:c,1)+0.587*a3(1:r,1:c,2)+0.1140*a3(1:r,1:c,3);

for i=1:r
    for j=1:c
        if ca3(i,j,:)>127
            ca3(i,j,:)=255;
        else
            ca3(i,j,:)=0;
        end
    end
end

%imshow(ca3);

[r,c,d]=size(a4);
ca4(1:r,1:c,2)=0.2989*a4(1:r,1:c,1)+0.587*a4(1:r,1:c,2)+0.1140*a4(1:r,1:c,3);
ca4(1:r,1:c,1)=0;
ca4(1:r,1:c,3)=0;

imshow(a4);
[r,c,d]=size(x);
final(1:floor(r/2),1:floor(c/2),:)=a1(1:floor(r/2),1:floor(c/2),:);
final(floor(r/2)+1:r,1:floor(c/2),:)=ca2(1:floor(r/2),1:floor(c/2),:);
final(1:floor(r/2),floor(c/2)+1:c,:)=ca3(1:floor(r/2),1:floor(c/2),:);
final(floor(r/2)+1:r,floor(c/2)+1:c,:)=ca4(1:floor(r/2),1:floor(c/2),:);

imshow(final);
imwrite(final,'output.jpg');