package allinter.cdt;

import java.util.Map;

public class Style {
//    public String alignContent;
//    public String alignItems;
//    public String alignSelf;
//    public String alignmentBaseline;
//    public String all;
//    public String animation;
//    public String animationDelay;
//    public String animationDirection;
//    public String animationDuration;
//    public String animationFillMode;
//    public String animationIterationCount;
//    public String animationName;
//    public String animationPlayState;
//    public String animationTimingFunction;
//    public String backdropFilter;
//    public String backfaceVisibility;
    public String background;
//    public String backgroundAttachment;
//    public String backgroundBlendMode;
//    public String backgroundClip;
    public String backgroundColor;
    public String backgroundImage;
//    public String backgroundOrigin;
//    public String backgroundPosition;
//    public String backgroundPositionX;
//    public String backgroundPositionY;
//    public String backgroundRepeat;
//    public String backgroundRepeatX;
//    public String backgroundRepeatY;
//    public String backgroundSize;
//    public String baselineShift;
//    public String blockSize;
//    public String border;
//    public String borderBlockEnd;
//    public String borderBlockEndColor;
//    public String borderBlockEndStyle;
//    public String borderBlockEndWidth;
//    public String borderBlockStart;
//    public String borderBlockStartColor;
//    public String borderBlockStartStyle;
//    public String borderBlockStartWidth;
//    public String borderBottom;
//    public String borderBottomColor;
//    public String borderBottomLeftRadius;
//    public String borderBottomRightRadius;
//    public String borderBottomStyle;
//    public String borderBottomWidth;
//    public String borderCollapse;
//    public String borderColor;
//    public String borderImage;
//    public String borderImageOutset;
//    public String borderImageRepeat;
//    public String borderImageSlice;
//    public String borderImageSource;
//    public String borderImageWidth;
//    public String borderInlineEnd;
//    public String borderInlineEndColor;
//    public String borderInlineEndStyle;
//    public String borderInlineEndWidth;
//    public String borderInlineStart;
//    public String borderInlineStartColor;
//    public String borderInlineStartStyle;
//    public String borderInlineStartWidth;
//    public String borderLeft;
//    public String borderLeftColor;
//    public String borderLeftStyle;
//    public String borderLeftWidth;
//    public String borderRadius;
//    public String borderRight;
//    public String borderRightColor;
//    public String borderRightStyle;
//    public String borderRightWidth;
//    public String borderSpacing;
//    public String borderStyle;
//    public String borderTop;
//    public String borderTopColor;
//    public String borderTopLeftRadius;
//    public String borderTopRightRadius;
//    public String borderTopStyle;
//    public String borderTopWidth;
//    public String borderWidth;
//    public String bottom;
//    public String boxShadow;
//    public String boxSizing;
//    public String breakAfter;
//    public String breakBefore;
//    public String breakInside;
//    public String bufferedRendering;
//    public String captionSide;
//    public String caretColor;
//    public String clear;
//    public String clip;
//    public String clipPath;
//    public String clipRule;
    public String color;
//    public String colorInterpolation;
//    public String colorInterpolationFilters;
//    public String colorRendering;
//    public String colorScheme;
//    public String columnCount;
//    public String columnFill;
//    public String columnGap;
//    public String columnRule;
//    public String columnRuleColor;
//    public String columnRuleStyle;
//    public String columnRuleWidth;
//    public String columnSpan;
//    public String columnWidth;
//    public String columns;
//    public String contain;
//    public String containIntrinsicSize;
//    public String content;
//    public String counterIncrement;
//    public String counterReset;
//    public String cursor;
//    public String cx;
//    public String cy;
//    public String d;
//    public String direction;
//    public String display;
//    public String dominantBaseline;
//    public String emptyCells;
//    public String fill;
//    public String fillOpacity;
//    public String fillRule;
//    public String filter;
//    public String flex;
//    public String flexBasis;
//    public String flexDirection;
//    public String flexFlow;
//    public String flexGrow;
//    public String flexShrink;
//    public String flexWrap;
//    private String cssFloat;
//    public String floodColor;
//    public String floodOpacity;
//    public String font;
//    public String fontDisplay;
//    public String fontFamily;
//    public String fontFeatureSettings;
//    public String fontKerning;
//    public String fontOpticalSizing;
    public String fontSize;
//    public String fontStretch;
//    public String fontStyle;
//    public String fontVariant;
//    public String fontVariantCaps;
//    public String fontVariantEastAsian;
//    public String fontVariantLigatures;
//    public String fontVariantNumeric;
//    public String fontVariationSettings;
//    public String fontWeight;
//    public String gap;
//    public String grid;
//    public String gridArea;
//    public String gridAutoColumns;
//    public String gridAutoFlow;
//    public String gridAutoRows;
//    public String gridColumn;
//    public String gridColumnEnd;
//    public String gridColumnGap;
//    public String gridColumnStart;
//    public String gridGap;
//    public String gridRow;
//    public String gridRowEnd;
//    public String gridRowGap;
//    public String gridRowStart;
//    public String gridTemplate;
//    public String gridTemplateAreas;
//    public String gridTemplateColumns;
//    public String gridTemplateRows;
//    public String height;
//    public String hyphens;
//    public String imageOrientation;
//    public String imageRendering;
//    public String inlineSize;
//    public String isolation;
//    public String justifyContent;
//    public String justifyItems;
//    public String justifySelf;
//    public String left;
//    public String letterSpacing;
//    public String lightingColor;
//    public String lineBreak;
//    public String lineHeight;
//    public String listStyle;
//    public String listStyleImage;
//    public String listStylePosition;
//    public String listStyleType;
//    public String margin;
//    public String marginBlockEnd;
//    public String marginBlockStart;
//    public String marginBottom;
//    public String marginInlineEnd;
//    public String marginInlineStart;
//    public String marginLeft;
//    public String marginRight;
//    public String marginTop;
//    public String marker;
//    public String markerEnd;
//    public String markerMid;
//    public String markerStart;
//    public String mask;
//    public String maskType;
//    public String maxBlockSize;
//    public String maxHeight;
//    public String maxInlineSize;
//    public String maxWidth;
//    public String maxZoom;
//    public String minBlockSize;
//    public String minHeight;
//    public String minInlineSize;
//    public String minWidth;
//    public String minZoom;
//    public String mixBlendMode;
//    public String objectFit;
//    public String objectPosition;
//    public String offset;
//    public String offsetDistance;
//    public String offsetPath;
//    public String offsetRotate;
    public String opacity;
//    public String order;
//    public String orientation;
//    public String orphans;
//    public String outline;
//    public String outlineColor;
//    public String outlineOffset;
//    public String outlineStyle;
//    public String outlineWidth;
//    public String overflow;
//    public String overflowAnchor;
//    public String overflowWrap;
//    public String overflowX;
//    public String overflowY;
//    public String overscrollBehavior;
//    public String overscrollBehaviorBlock;
//    public String overscrollBehaviorInline;
//    public String overscrollBehaviorX;
//    public String overscrollBehaviorY;
//    public String padding;
//    public String paddingBlockEnd;
//    public String paddingBlockStart;
//    public String paddingBottom;
//    public String paddingInlineEnd;
//    public String paddingInlineStart;
//    public String paddingLeft;
//    public String paddingRight;
//    public String paddingTop;
//    public String pageBreakAfter;
//    public String pageBreakBefore;
//    public String pageBreakInside;
//    public String paintOrder;
//    public String perspective;
//    public String perspectiveOrigin;
//    public String placeContent;
//    public String placeItems;
//    public String placeSelf;
//    public String pointerEvents;
//    public String position;
//    public String quotes;
//    public String r;
//    public String resize;
//    public String right;
//    public String rowGap;
//    public String rx;
//    public String ry;
//    public String scrollBehavior;
//    public String scrollMargin;
//    public String scrollMarginBlock;
//    public String scrollMarginBlockEnd;
//    public String scrollMarginBlockStart;
//    public String scrollMarginBottom;
//    public String scrollMarginInline;
//    public String scrollMarginInlineEnd;
//    public String scrollMarginInlineStart;
//    public String scrollMarginLeft;
//    public String scrollMarginRight;
//    public String scrollMarginTop;
//    public String scrollPadding;
//    public String scrollPaddingBlock;
//    public String scrollPaddingBlockEnd;
//    public String scrollPaddingBlockStart;
//    public String scrollPaddingBottom;
//    public String scrollPaddingInline;
//    public String scrollPaddingInlineEnd;
//    public String scrollPaddingInlineStart;
//    public String scrollPaddingLeft;
//    public String scrollPaddingRight;
//    public String scrollPaddingTop;
//    public String scrollSnapAlign;
//    public String scrollSnapStop;
//    public String scrollSnapType;
//    public String shapeImageThreshold;
//    public String shapeMargin;
//    public String shapeOutside;
//    public String shapeRendering;
//    public String size;
//    public String speak;
//    public String src;
//    public String stopColor;
//    public String stopOpacity;
//    public String stroke;
//    public String strokeDasharray;
//    public String strokeDashoffset;
//    public String strokeLinecap;
//    public String strokeLinejoin;
//    public String strokeMiterlimit;
//    public String strokeOpacity;
//    public String strokeWidth;
//    public String tabSize;
//    public String tableLayout;
//    public String textAlign;
//    public String textAlignLast;
//    public String textAnchor;
//    public String textCombineUpright;
//    public String textDecoration;
//    public String textDecorationColor;
//    public String textDecorationLine;
//    public String textDecorationSkipInk;
//    public String textDecorationStyle;
//    public String textIndent;
//    public String textOrientation;
//    public String textOverflow;
//    public String textRendering;
//    public String textShadow;
//    public String textSizeAdjust;
//    public String textTransform;
//    public String textUnderlinePosition;
//    public String top;
//    public String touchAction;
//    public String transform;
//    public String transformBox;
//    public String transformOrigin;
//    public String transformStyle;
//    public String transition;
//    public String transitionDelay;
//    public String transitionDuration;
//    public String transitionProperty;
//    public String transitionTimingFunction;
//    public String unicodeBidi;
//    public String unicodeRange;
//    public String userSelect;
//    public String userZoom;
//    public String vectorEffect;
//    public String verticalAlign;
//    public String visibility;
//    public String webkitAlignContent;
//    public String webkitAlignItems;
//    public String webkitAlignSelf;
//    public String webkitAnimation;
//    public String webkitAnimationDelay;
//    public String webkitAnimationDirection;
//    public String webkitAnimationDuration;
//    public String webkitAnimationFillMode;
//    public String webkitAnimationIterationCount;
//    public String webkitAnimationName;
//    public String webkitAnimationPlayState;
//    public String webkitAnimationTimingFunction;
//    public String webkitAppRegion;
//    public String webkitAppearance;
//    public String webkitBackfaceVisibility;
//    public String webkitBackgroundClip;
//    public String webkitBackgroundOrigin;
//    public String webkitBackgroundSize;
//    public String webkitBorderAfter;
//    public String webkitBorderAfterColor;
//    public String webkitBorderAfterStyle;
//    public String webkitBorderAfterWidth;
//    public String webkitBorderBefore;
//    public String webkitBorderBeforeColor;
//    public String webkitBorderBeforeStyle;
//    public String webkitBorderBeforeWidth;
//    public String webkitBorderBottomLeftRadius;
//    public String webkitBorderBottomRightRadius;
//    public String webkitBorderEnd;
//    public String webkitBorderEndColor;
//    public String webkitBorderEndStyle;
//    public String webkitBorderEndWidth;
//    public String webkitBorderHorizontalSpacing;
//    public String webkitBorderImage;
//    public String webkitBorderRadius;
//    public String webkitBorderStart;
//    public String webkitBorderStartColor;
//    public String webkitBorderStartStyle;
//    public String webkitBorderStartWidth;
//    public String webkitBorderTopLeftRadius;
//    public String webkitBorderTopRightRadius;
//    public String webkitBorderVerticalSpacing;
//    public String webkitBoxAlign;
//    public String webkitBoxDecorationBreak;
//    public String webkitBoxDirection;
//    public String webkitBoxFlex;
//    public String webkitBoxOrdinalGroup;
//    public String webkitBoxOrient;
//    public String webkitBoxPack;
//    public String webkitBoxReflect;
//    public String webkitBoxShadow;
//    public String webkitBoxSizing;
//    public String webkitClipPath;
//    public String webkitColumnBreakAfter;
//    public String webkitColumnBreakBefore;
//    public String webkitColumnBreakInside;
//    public String webkitColumnCount;
//    public String webkitColumnGap;
//    public String webkitColumnRule;
//    public String webkitColumnRuleColor;
//    public String webkitColumnRuleStyle;
//    public String webkitColumnRuleWidth;
//    public String webkitColumnSpan;
//    public String webkitColumnWidth;
//    public String webkitColumns;
//    public String webkitFilter;
//    public String webkitFlex;
//    public String webkitFlexBasis;
//    public String webkitFlexDirection;
//    public String webkitFlexFlow;
//    public String webkitFlexGrow;
//    public String webkitFlexShrink;
//    public String webkitFlexWrap;
//    public String webkitFontFeatureSettings;
//    public String webkitFontSizeDelta;
//    public String webkitFontSmoothing;
//    public String webkitHighlight;
//    public String webkitHyphenateCharacter;
//    public String webkitJustifyContent;
//    public String webkitLineBreak;
//    public String webkitLineClamp;
//    public String webkitLocale;
//    public String webkitLogicalHeight;
//    public String webkitLogicalWidth;
//    public String webkitMarginAfter;
//    public String webkitMarginBefore;
//    public String webkitMarginEnd;
//    public String webkitMarginStart;
//    public String webkitMask;
//    public String webkitMaskBoxImage;
//    public String webkitMaskBoxImageOutset;
//    public String webkitMaskBoxImageRepeat;
//    public String webkitMaskBoxImageSlice;
//    public String webkitMaskBoxImageSource;
//    public String webkitMaskBoxImageWidth;
//    public String webkitMaskClip;
//    public String webkitMaskComposite;
//    public String webkitMaskImage;
//    public String webkitMaskOrigin;
//    public String webkitMaskPosition;
//    public String webkitMaskPositionX;
//    public String webkitMaskPositionY;
//    public String webkitMaskRepeat;
//    public String webkitMaskRepeatX;
//    public String webkitMaskRepeatY;
//    public String webkitMaskSize;
//    public String webkitMaxLogicalHeight;
//    public String webkitMaxLogicalWidth;
//    public String webkitMinLogicalHeight;
//    public String webkitMinLogicalWidth;
//    public String webkitOpacity;
//    public String webkitOrder;
//    public String webkitPaddingAfter;
//    public String webkitPaddingBefore;
//    public String webkitPaddingEnd;
//    public String webkitPaddingStart;
//    public String webkitPerspective;
//    public String webkitPerspectiveOrigin;
//    public String webkitPerspectiveOriginX;
//    public String webkitPerspectiveOriginY;
//    public String webkitPrintColorAdjust;
//    public String webkitRtlOrdering;
//    public String webkitRubyPosition;
//    public String webkitShapeImageThreshold;
//    public String webkitShapeMargin;
//    public String webkitShapeOutside;
//    public String webkitTapHighlightColor;
//    public String webkitTextCombine;
//    public String webkitTextDecorationsInEffect;
//    public String webkitTextEmphasis;
//    public String webkitTextEmphasisColor;
//    public String webkitTextEmphasisPosition;
//    public String webkitTextEmphasisStyle;
//    public String webkitTextFillColor;
//    public String webkitTextOrientation;
//    public String webkitTextSecurity;
//    public String webkitTextSizeAdjust;
//    public String webkitTextStroke;
//    public String webkitTextStrokeColor;
//    public String webkitTextStrokeWidth;
//    public String webkitTransform;
//    public String webkitTransformOrigin;
//    public String webkitTransformOriginX;
//    public String webkitTransformOriginY;
//    public String webkitTransformOriginZ;
//    public String webkitTransformStyle;
//    public String webkitTransition;
//    public String webkitTransitionDelay;
//    public String webkitTransitionDuration;
//    public String webkitTransitionProperty;
//    public String webkitTransitionTimingFunction;
//    public String webkitUserDrag;
//    public String webkitUserModify;
//    public String webkitUserSelect;
//    public String webkitWritingMode;
//    public String whiteSpace;
//    public String widows;
//    public String width;
//    public String willChange;
//    public String wordBreak;
//    public String wordSpacing;
//    public String wordWrap;
//    public String writingMode;
//    public String x;
//    public String y;
//    public String zIndex;
//    public String zoom;

    public Style() {
    }

    public static Style convertFrom(Map<String, ?> map) {
        Style ret = new Style();

        map.forEach((key, value) -> {
            switch (key) {
                case "background":
                    ret.background = (String) value;
                    break;
                case "backgroundColor":
                    ret.backgroundColor = (String) value;
                    break;
                case "backgroundImage":
                    ret.backgroundImage = (String) value;
                    break;
                case "color":
                    ret.color = (String) value;
                    break;
                case "fontSize":
                    ret.fontSize = (String) value;
                    break;
                case "opacity":
                    ret.opacity = (String) value;
                    break;
            }
        });

        return ret;
    }

//    public String getFloat() {
//        return this.cssFloat;
//    }
//
//    public void setFloat(String value) {
//        this.cssFloat = value;
//    }
}
