import Text.Printf

type Point     = (Float,Float)
type Rect      = (Point,Float,Float)

-- Gera retangulo SVG 
-- a partir de coordenadas+dimensoes e de uma string com atributos de estilo
writeRect :: (String,Rect) -> String 
writeRect (style,((x,y),w,h)) = 
  printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' style='%s' />\n" x y w h style

-- Gera codigo-fonte de arquivo SVG 
-- concatenando uma lista de retangulos e seus atributos de estilo
writeRects :: Float -> Float -> [(String,Rect)] -> String 
writeRects w h rs = 
  printf "<svg width='%.2f' height='%.2f' xmlns='http://www.w3.org/2000/svg' style='background: grey'>\n" w h 
      ++ (concatMap writeRect rs) ++ "</svg>"

main :: IO ()
main = do
  let
    criaStr = ["fill:hsl(130," ++ show x ++ "%," ++ show y ++ "%)" | x<-[100,75..0], y<-[100,86..0]]
    criaCoor = [((x,y),56,28) | x<-[10,70..250], y<-[10,40..220]]
    rects = zip criaStr criaCoor
    (w,h) = (1000,1000)
  writeFile "colors.svg" $ writeRects w h rects