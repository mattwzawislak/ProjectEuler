print:
	.asciz	"Sum: %d\n"

	.align 	4

	.global	main
main:
	save	%sp,	-92,	%sp

	clr		%l0
	mov		3,		%l1

loop:

	mov		%l1,	%o0
	call	.rem
	mov		3,		%o1

	cmp		%o0,	0
	be		yes
	nop

	mov		%l1,	%o0
	call	.rem
	mov		5,		%o1

	cmp		%o0,	0
	be		yes
	nop	
	ba		post
	nop

yes:
	add		%l0,	%l1,	%l0	
post:

	cmp		%l1,	999
	bl		loop
	inc		%l1

	set		print,	%o0
	call	printf
	mov		%l0,	%o1

	mov		1,		%g1
	ta		0
