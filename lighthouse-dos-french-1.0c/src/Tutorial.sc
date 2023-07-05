;;; Sierra Script 1.0 - (do not remove this comment)
;;; Decompiled by sluicebox
(script# 64980)
(include sci.sh)
(use Main)
(use Print)
(use System)

(class Tutorial of Script
	(properties
		nextAction 0
		nextItem 0
		numTries 0
	)

	(method (waitFor obj act nOrMsg v c s m)
		(= nextItem obj)
		(= nextAction act)
		(cond
			((== argc 3)
				(Prints nOrMsg)
			)
			((> argc 3)
				(gMessager say: nOrMsg v c s m)
			)
		)
	)

	(method (report))

	(method (cue)
		(= numTries 0)
		(super cue: &rest)
	)
)
