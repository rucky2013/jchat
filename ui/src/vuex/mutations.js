import * as types from './mutation-types'
export default {
  [types.INIT_DATA](state){
    let data = localStorage.getItem('jchat-data');
    if (data) {
        state=data;
    }
  },
  [types.INIT_DATA_FROM_WEB](state,jsonObj){
     if(jsonObj){
       state.user=jsonObj.user;
       state.sessions=jsonObj.sessions;
     }
  },
  [types.SEND_MESSAGE]({ sessions, currentSessionId }, content){
    let session = sessions.find(item => item.id === currentSessionId);
    session.messages.push({
        content: content,
        date: new Date(),
        self: true
    });
  },
  [types.SELECT_SESSION](state, id){
   state.currentSessionId = id;
  },
   [types.SET_FILTER_KEY] (state, value) {
       state.filterKey = value;
   },
  [types.SAVE_DATA_BEFORE_CLOSED](state){
    localStorage.setItem("jchat-data",state);
  }
}
