MVI A, 0D5H
MVI B, 3BH
ADD B
LXI H;, 0001H
MOV M, A
MVI A, 00H
MVI B, 00H
ADC B
DCX H
MOV M, A
HLT
