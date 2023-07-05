;;; Sierra Script 1.0 - (do not remove this comment)
;;; Decompiled by sluicebox
(script# 816)
(include sci.sh)
(use Main)
(use PseudoMouse)
(use PolyPath)
(use Polygon)
(use LoadMany)
(use User)
(use System)

(public
	LL1InitCode 0
)

(instance LL1InitCode of Code
	(properties)

	(method (init)
		(if (> (Graph grGET_COLOURS) 16)
			(= gColBlack (Palette palFIND_COLOR 31 31 31))
			(= gColGray1 (Palette palFIND_COLOR 63 63 63))
			(= gColGray2 (Palette palFIND_COLOR 95 95 95))
			(= gColGray3 (Palette palFIND_COLOR 127 127 127))
			(= gColGray4 (Palette palFIND_COLOR 159 159 159))
			(= gColGray5 (Palette palFIND_COLOR 191 191 191))
			(= gColWhite (Palette palFIND_COLOR 223 223 223))
			(= gColDRed (Palette palFIND_COLOR 151 27 27))
			(= gColLRed (Palette palFIND_COLOR 255 77 77))
			(= gColVLRed (Palette palFIND_COLOR 235 135 135))
			(= gColDYellow (Palette palFIND_COLOR 187 187 35))
			(= gColYellow (Palette palFIND_COLOR 219 219 39))
			(= gColLYellow (Palette palFIND_COLOR 223 223 71))
			(= gColVDGreen (Palette palFIND_COLOR 15 87 15))
			(= gColDGreen (Palette palFIND_COLOR 27 151 27))
			(= gColLGreen (Palette palFIND_COLOR 71 223 71))
			(= gColVLGreen (Palette palFIND_COLOR 135 235 135))
			(= gColDBlue (Palette palFIND_COLOR 23 23 119))
			(= gColBlue (Palette palFIND_COLOR 35 35 187))
			(= gColLBlue (Palette palFIND_COLOR 71 71 223))
			(= gColVLBlue (Palette palFIND_COLOR 135 135 235))
			(= gColMagenta (Palette palFIND_COLOR 219 39 219))
			(= gColLMagenta (Palette palFIND_COLOR 255 77 255))
			(= gColCyan (Palette palFIND_COLOR 27 151 151))
			(= gColLCyan (Palette palFIND_COLOR 77 255 255))
			(= gColWindow (Palette palFIND_COLOR 255 255 120))
		else
			(= gColBlack 0)
			(= gColGray1 7)
			(= gColGray2 8)
			(= gColGray3 7)
			(= gColGray4 7)
			(= gColGray5 7)
			(= gColWhite 15)
			(= gColDRed 4)
			(= gColLRed 12)
			(= gColVLRed 12)
			(= gColDYellow 6)
			(= gColYellow 14)
			(= gColLYellow 14)
			(= gColVDGreen 2)
			(= gColDGreen 2)
			(= gColLGreen 10)
			(= gColVLGreen 10)
			(= gColDBlue 1)
			(= gColBlue 1)
			(= gColLBlue 9)
			(= gColVLBlue 9)
			(= gColMagenta 5)
			(= gColLMagenta 13)
			(= gColCyan 3)
			(= gColLCyan 11)
			(= gColWindow 14)
		)
		(= gNumVoices (DoSound sndGET_POLYPHONY))
		(if (and (>= (= gNumColors (Graph grGET_COLOURS)) 2) (<= gNumColors 16))
			(ClearFlag 44)
		else
			(SetFlag 44)
		)
		(= gUseSortedFeatures 1)
		PolyPath
		Polygon
		(ScriptID 982)
		(User alterEgo: gEgo verbMessager: 0 canControl: 0 canInput: 0)
		(gGame setCursor: gTheCursor 1 304 172)
		(gSystemWindow color: 0 back: gColWindow)
		(= gPMouse PseudoMouse)
		(= gEatMice 3)
		(= gWaitCursor 997)
		(= gScore 0)
		(= gPossibleScore 222)
		(= gBigFont 2108)
		(= gUserFont 2107)
		(= gSmallFont 1207)
		(= global313 2407)
		(= global312 4115)
		(LoadMany rsFONT 0 gUserFont gBigFont gSmallFont)
	)
)
