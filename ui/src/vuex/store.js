import Vue from 'vue';
import Vuex from 'vuex';
import * as actions from './actions'
import * as getters from './getters'
import mutations from './mutations';

Vue.use(Vuex);

const now = new Date();
const state = {
  user: {
      name: 'water',
      img: '/static/jcala.jpg'
  },
  sessions: [
      {
          id: 1,
          user: {
              name: 'fire',
              img: '/static/kaxi.jpg'
          },
          messages: [
              {
                  content: 'Hello,好久不见',
                  date: now
              }, {
                  content: '你还好吗？',
                  date: now
              }
          ]
      },
      {
          id: 2,
          user: {
              name: 'gold',
              img: '/static/paoying.jpg'
          },
          messages: []
      }
  ],
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
