import * as types from './mutation-types'

export const initData= ({ commit }) => {
   commit(types.INIT_DATA)
}

export const initWebData = ({ commit }, jsonObj) => {
  commit(types.INIT_DATA_FROM_WEB, jsonObj)
}
export const sendMessage = ({ commit }, content) => {
  commit(types.SEND_MESSAGE, content)
}

export const selectSession = ({ commit }, id) => {
  commit(types.SELECT_SESSION, id)
}

export const search = ({ commit }, value) => {
  commit(types.SET_FILTER_KEY, value)
}
