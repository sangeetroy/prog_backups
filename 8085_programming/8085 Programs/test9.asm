 .ORG 0000H
 MOV A,L
 ADD E
 DAA
 STA 2300H
 ADC D
 DAA
 STA 2301H
 HLT