import { Card } from "./components/Card";
import { GameHeader } from "./components/GameHeader"
import { WinMessage } from "./components/WinMessage";
import { useGameLogic } from "./hooks/useGameLogic";

const cardValues = [
  "😀", "😎", "🔥", "💖", "🎉", "🚀", "🐱", "🍕",
  "😀", "😎", "🔥", "💖", "🎉", "🚀", "🐱", "🍕"
];
function App() {
  const {
    cards,
    score,
    moves,
    handleCardClick,
    initilizeGame,
    isGameComplete,
  } = useGameLogic(cardValues);
  
  return (
    <div className="app">
      <GameHeader score={score} moves={moves} onReset={initilizeGame} />
      {isGameComplete && <WinMessage moves={moves} />}

    
      <div className="cards-grid">
        {cards.map((card) => (
          <Card 
          key={card.id}
          card={card}
          onClick={handleCardClick}
          />
        ))}
      </div>


    </div>
  )
}

export default App
