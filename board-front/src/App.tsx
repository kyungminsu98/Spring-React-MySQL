import React from 'react';
import './App.css';
import BoardItem from 'components/BoardItem';
import { commentListMock, favoriteListMock, latestBoardListMock, top3BoardListMock } from 'mocks';
import Top3Item from 'components/Top3Item';
import CommentItem from 'components/CommentItem';
import FavoriteItem from 'components/FavoriteItem';

function App() {
  return (
    <>
      {/* {latestBoardListMock.map(boardListItem => <BoardItem boardListItem={boardListItem} />)} */}
      {/* <div style={{display:'flex', justifyContent:'center', gap:'24px'}}>
        {top3BoardListMock.map(top3ListItem => <Top3Item top3listItem={top3ListItem}/>)}
      </div> */}
      <div style={{display:'flex', rowGap:'20px', columnGap:'20px'}}>
        {favoriteListMock.map(favoriteListMock=><FavoriteItem favoriteListItem={favoriteListMock}/>)}
      </div>
    </>
  );
}

export default App;
