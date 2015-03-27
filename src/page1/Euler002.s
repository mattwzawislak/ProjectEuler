print:
    .asciz  "Sum = %d\n"

    .align  4

    .global main
main:
	save   %sp,    -92,    %sp

    mov     1,      %l0
    mov     1,      %l1
    mov     0,      %l2
    mov     0,      %l3

	mov		1,		%l4
	mov		1,		%l5

	mov		488,	%l7
	sll		%l7,	13,		%l7
	or		%l7,	2304,	%l7

loop:
	
	add		%l0,	%l1,	%l2

	mov		%l5,	%l6
	xor		%l4,	%l5,	%l5
	mov		%l6,	%l4

	cmp		%l5,	0
	bne		post
	nop

	add		%l3,	%l2,	%l3

post:	

	mov		%l1,	%l0
	mov		%l2,	%l1

	cmp		%l2,	%l7
	ble		loop
	nop

	set		print,	%o0
	call	printf
	mov		%l3,	%o1	

	mov 	1,		%g1
	ta		0