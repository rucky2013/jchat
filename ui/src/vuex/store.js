import Vue from 'vue';
import Vuex from 'vuex';
import * as actions from './actions'
import * as getters from './getters'
import mutations from './mutations';

Vue.use(Vuex);

const state = {
  user: {},
  sessions: [],
  currentSessionId: 1,
  filterKey: ''
}
const store = new Vuex.Store({
    state,
    actions,
    getters,
    mutations
})

export default store
