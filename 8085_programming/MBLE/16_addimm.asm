MVI B, 79H
MOV A, B
ADI 67H
;STA 0000H
LXI H, 0000H
MOV M, A
HLT