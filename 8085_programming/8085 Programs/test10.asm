 .ORG 0000H
 LDA 2200H
 SUB A
 LXI H,2201H
BACK: ADD M
 INX H
 DCR C
 JNZ BACK
 STA 2300H
 HLT